package com.zscdumin.RedisTest;

import redis.clients.jedis.Jedis;

import java.util.List;

public class Demo {
	public static void main(String[] args) {
		/**
		 * 连接本地的 Redis 服务
		 */
		Jedis jedis = new Jedis("localhost");//主机IP地址
		jedis.auth("root"); //密码
		System.out.println("connect success!");
		System.out.println("service is running: " + jedis.ping());    //查看服务是否运行

		System.out.println("##################################################");

		/**
		 * SET操作
		 */
		jedis.set("name", "zhanshan");
		System.out.println(jedis.get("name"));

		System.out.println("##################################################");

		/**
		 * List操作
		 */
		jedis.lpush("site", "china", "us", "japan");
		List<String> list = jedis.lrange("site", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("##################################################");

		/**
		 * Hash操作
		 */
		jedis.hset("key", "name", "dumin");
		jedis.hdel("key", "name");
		System.out.println(jedis.hget("key", "name"));

	}
}
