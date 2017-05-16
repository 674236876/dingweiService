package com.myd.utils;

import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by zhugp on 2017/5/4.
 */
public class GPSTransferUtil {


    private static Log log = LogFactory.getLog(GPSTransferUtil.class);
    /**
     *
     *  根据gps经纬度转换百度地图经纬度
     *  @param lat mapbar获取的纬度
     *  @param lon mapbar获取的经度
     */
    public String getBaiduPosition(String lon, String lat)
    {
        try
        {
            lat = lat.trim();
            lon = lon.trim();


            String getDecodeUrl = "http://api.map.baidu.com/ag/coord/convert?from=0&to=4&x=";
            getDecodeUrl = getDecodeUrl + lon + "&y=" + lat;
            String urlstring = getDecodeUrl;

            URL url = new URL(urlstring);

            URLConnection conn = url.openConnection();

            InputStream in = conn.getInputStream();
            byte[] tempbuff = new byte[100]; // ....
            byte[] buff = new byte[1024]; // ..........
            int count = 0; // ......
            int rbyte = 0; // .......

            while ((rbyte = in.read(tempbuff)) != -1) {
                for (int i = 0; i < rbyte; i++)
                    buff[count + i] = tempbuff[i];
                count += rbyte;
            }

            in.close();

            byte[] result = new byte[count];
            for (int i = 0; i < count; i++)
                result[i] = buff[i];

            String output = new String(result, "UTF-8");

            JSONObject jsonObj = JSONObject.fromObject(output);
            String dstLng = jsonObj.getString("x");
            String dstLat = jsonObj.getString("y");
            return	dstLng+"_"+dstLat;

        }catch (Exception e) {
            log.error("根据经纬度查询百度信息失败!" + e);
            return "";
        }
    }


    /**
     * 根据gps经纬度转换google地图经纬度
     * @param lon   mapbar获取的纬度
     * @param lat   mapbar获取的经度
     * @return
     */
    public String getGooglePosition(String lon, String lat)
    {
        try
        {
            lat = lat.trim();
            lon = lon.trim();

            String urlstring = "http://lbs.juhe.cn/api/google.php?lon="+lon+"&lat="+lat+"&dtype=json";

            URL url = new URL(urlstring);

            URLConnection conn = url.openConnection();

            InputStream in = conn.getInputStream();
            byte[] tempbuff = new byte[100]; // ....
            byte[] buff = new byte[1024]; // ..........
            int count = 0; // ......
            int rbyte = 0; // .......

            while ((rbyte = in.read(tempbuff)) != -1) {
                for (int i = 0; i < rbyte; i++)
                    buff[count + i] = tempbuff[i];
                count += rbyte;
            }

            in.close();

            byte[] result = new byte[count];
            for (int i = 0; i < count; i++)
                result[i] = buff[i];

            String output = new String(result, "UTF-8");

            JSONObject jsonObj = JSONObject.fromObject(output);
            String xx = jsonObj.getString("row");
            JSONObject jsonObj1 = JSONObject.fromObject(xx);
            String dstLng = jsonObj1.getString("off_lon");
            String dstLat = jsonObj1.getString("off_lat");
            log.error("根据经纬度查询google 信息：" + dstLng+"_"+dstLat);
            return	dstLng+"_"+dstLat;

        }

        catch (Exception e) {
            log.error("根据经纬度查询google信息失败!" + e);
            return "";
        }
    }

}
