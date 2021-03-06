package com.willie.cloud.vod.constent.vod;

/**
 * <p>功能 描述:点播服务常量接口</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/28 16:59</p>
 */
public interface Vod {
    long DEFAULT_EXPIRES = 60 * 60 * 24;//默认token有效期

    /**
     * 暴风云点播基本常量
     */
    class BfCloudConstent {
        public static final String VOD_DOMAIN = "http://api.bfvyun.com";//点播服务api
        public static final String APP_NAME = "baofeng";//点播服务名称
    }

    /**
     * 腾讯云点播基本常量
     */
    class QCloudConstent {
        public static final String VOD_DOMAIN = "vod.api.qcloud.com";//腾讯点播api域名
        public static final String SERVER_URI = "/v2/index.php";
        public static final String APP_NAME = "tencent";//点播服务名称
    }

    /**
     * 阿里云点播基本常量
     */
    class AliyunConstent {
        public static final String VOD_DOMAIN = "http://vod.cn-shanghai.aliyuncs.com";//阿里云点播服务api
        public static final String APP_NAME = "aliyun";//点播服务名称
        public static final String REGION_ID = "cn-shanghai";//区域id
    }
}
