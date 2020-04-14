package com.crawler.common.constant;

/**
 * des
 *
 * @author chenzhaohui
 * @date 2020/4/13
 */
public interface Constants {

	String link = "https://www.guahao.com/hospital/[provinceId]/[provinceName]/[cityId]/[cityName]/p{{page}}";

	String provinces = "[\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"上海\",\n" +
			"        \"value\": \"2\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"北京\",\n" +
			"        \"value\": \"1\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"广东\",\n" +
			"        \"value\": \"29\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"江苏\",\n" +
			"        \"value\": \"22\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"浙江\",\n" +
			"        \"value\": \"24\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"陕西\",\n" +
			"        \"value\": \"9\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"甘肃\",\n" +
			"        \"value\": \"11\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"山东\",\n" +
			"        \"value\": \"21\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"山西\",\n" +
			"        \"value\": \"8\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"湖北\",\n" +
			"        \"value\": \"19\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"湖南\",\n" +
			"        \"value\": \"30\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"天津\",\n" +
			"        \"value\": \"3\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"四川\",\n" +
			"        \"value\": \"15\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"江西\",\n" +
			"        \"value\": \"25\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"安徽\",\n" +
			"        \"value\": \"23\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"河南\",\n" +
			"        \"value\": \"20\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"河北\",\n" +
			"        \"value\": \"16\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"青海\",\n" +
			"        \"value\": \"12\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"辽宁\",\n" +
			"        \"value\": \"5\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"贵州\",\n" +
			"        \"value\": \"18\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"重庆\",\n" +
			"        \"value\": \"4\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"黑龙江\",\n" +
			"        \"value\": \"7\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"云南\",\n" +
			"        \"value\": \"17\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"广西\",\n" +
			"        \"value\": \"31\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"宁夏\",\n" +
			"        \"value\": \"10\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"西藏\",\n" +
			"        \"value\": \"14\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"内蒙古\",\n" +
			"        \"value\": \"33\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"海南\",\n" +
			"        \"value\": \"32\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"吉林\",\n" +
			"        \"value\": \"6\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"新疆\",\n" +
			"        \"value\": \"13\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"福建\",\n" +
			"        \"value\": \"27\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"香港\",\n" +
			"        \"value\": \"500\"\n" +
			"    },\n" +
			"    {\n" +
			"        \"backUrl\": null,\n" +
			"        \"code\": null,\n" +
			"        \"text\": \"澳门\",\n" +
			"        \"value\": \"501\"\n" +
			"    }\n" +
			"]";

	String city_link = "https://www.guahao.com/json/white/area/citys?provinceId={{code}}";
}
