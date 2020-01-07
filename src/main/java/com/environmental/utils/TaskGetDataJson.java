package com.environmental.utils;
import com.environmental.dao.EnvAllinfoMapper;
import com.environmental.entity.EnvAllinfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TaskGetDataJson {
    HttpURLConnection connection=null;
    InputStream is = null;
    BufferedReader br=null;
    String result = null;

    @Autowired
    private EnvAllinfoMapper envAllinfoMapper;


    /**
     *  定时器每天的固定时间进行数据库的插入刷新
     * */
   // @Scheduled(cron = "0 41 11 * * ?")
    @Scheduled(fixedRate = 620000)
    public void statutsCheckGetData(){
        System.out.println("每分钟执行一次");

        try {
            URL url = new URL("http://www.pm25.in/api/querys/all_cities.json?token=5j1znBVAsnSf5xQyNQyq");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            connection.connect();
            if(connection.getResponseCode()==200){
                is=connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp=br.readLine())!=null){
                    sbf.append(temp);
                }
                result = sbf.toString();
                JSONObject jsonObject = JSONObject.fromObject(result);
                List<JSONObject> list = (List<JSONObject>) jsonObject.get("data");
                List<EnvAllinfo> ls=new ArrayList<>();
                SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss'Z'" );
                for(int i=0;i<list.size();i++){
                    EnvAllinfo en=new EnvAllinfo();
                    en.setAqi(Integer.parseInt(list.get(i).get("aqi")+""));
                    en.setArea(list.get(i).get("area")+"");
                    en.setCo(Float.parseFloat(list.get(i).get("co")+""));
                    en.setCo24h(Float.parseFloat(list.get(i).get("co_24h")+""));
                    en.setNo2(Float.parseFloat(list.get(i).get("no2")+""));
                    en.setNo224h(Float.parseFloat(list.get(i).get("no2_24h")+""));
                    en.setO3(Float.parseFloat(list.get(i).get("o3")+""));
                    en.setO38h(Float.parseFloat(list.get(i).get("o3_8h")+""));
                    en.setO38h24h(Float.parseFloat(list.get(i).get("o3_8h_24h")+""));
                    en.setO324h(Float.parseFloat(list.get(i).get("o3_24h")+""));
                    en.setPm10(Float.parseFloat(list.get(i).get("pm10")+""));
                    en.setPm1024h(Float.parseFloat(list.get(i).get("pm10_24h")+""));
                    en.setPm25(Float.parseFloat(list.get(i).get("pm2_5")+""));
                    en.setPm2524h(Float.parseFloat(list.get(i).get("pm2_5_24h")+""));
                    en.setPositionName(list.get(i).get("position_name")+"");
                    en.setPrimaryPollutant(list.get(i).get("primary_pollutant")+"");
                    en.setQuality(list.get(i).get("quality")+"");
                    en.setSo2(Float.parseFloat(list.get(i).get("so2")+""));
                    en.setSo224h(Float.parseFloat(list.get(i).get("so2_24h")+""));
                    en.setStationCode(list.get(i).get("station_code")+"");
                    Date date=sdf.parse( list.get(i).get("time_point")+"");
                    en.setTimePoint(date);
                    ls.add(en);
                    envAllinfoMapper.insert(en);
                }
                //envAllinfoMapper.addEnvInfoByBatch(ls);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    /**
     * 定时器每两秒操作一次
     */
   // @Scheduled(fixedRate = 2000)
    public void testTasks(){
        System.out.println("每二秒执行一次");
    }

}
