package com.flashexpress.mysql.constants;

/**
 * @author xufengfeng
 * @date 2021/3/8
 */
public class DdlConstants {
  public static final String CREATE_DDL = "CREATE TABLE `parcel_info` (\n"
      + "  `pno` varchar(20) NOT NULL COMMENT '运单号',\n"
      + "  `recent_pno` varchar(20) DEFAULT NULL COMMENT '最新运单号',\n"
      + "  `pkg_code` varchar(20) DEFAULT NULL COMMENT '包裹条码',\n"
      + "  `pickup_source_category` tinyint(3) unsigned DEFAULT NULL COMMENT '包裹揽收来源',\n"
      + "  `parcel_category` tinyint(3) unsigned DEFAULT '1' COMMENT '包裹类型',\n"
      + "  `replacement_enabled` tinyint(1) unsigned DEFAULT NULL COMMENT '是否需要换单',\n"
      + "  `serial_no` varchar(20) DEFAULT NULL COMMENT '内部流水号',\n"
      + "  `customer_type_category` tinyint(3) unsigned DEFAULT NULL COMMENT '客户类型',\n"
      + "  `channel_category` tinyint(3) unsigned DEFAULT NULL COMMENT '渠道',\n"
      + "  `collection_channel_category` tinyint(3) unsigned DEFAULT NULL COMMENT '揽收渠道 1:KIT 2:BS 3:IPC',\n"
      + "  `sub_channel_category` tinyint(3) unsigned DEFAULT NULL COMMENT '二级渠道',\n"
      + "  `client_id` varchar(32) DEFAULT NULL COMMENT '客户ID',\n"
      + "  `sub_client_id` varchar(32) DEFAULT NULL COMMENT '子账号ID',\n"
      + "  `agent_id` varchar(32) DEFAULT NULL COMMENT '分销商ID',\n"
      + "  `cod_client_id` varchar(32) DEFAULT NULL COMMENT 'cod 账户ID',\n"
      + "  `out_trade_no` varchar(100) DEFAULT NULL COMMENT '商户内部订单号',\n"
      + "  `exchange_pno` varchar(20) DEFAULT NULL COMMENT '换货运单号',\n"
      + "  `return_receipt_enabled` tinyint(1) unsigned DEFAULT '0' COMMENT '是否需要签回单',\n"
      + "  `return_receipt_no` varchar(100) DEFAULT NULL COMMENT '签回单编号',\n"
      + "  `ka_warehouse_id` varchar(32) DEFAULT NULL COMMENT '仓库ID',\n"
      + "  `express_category` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '产品类别',\n"
      + "  `ticket_pickup_id` bigint(20) unsigned DEFAULT NULL COMMENT '收件任务ID',\n"
      + "  `ticket_pickup_staff_info_id` int(10) unsigned DEFAULT NULL COMMENT '收件员工工号',\n"
      + "  `ticket_pickup_store_id` varchar(10) DEFAULT NULL COMMENT '收件网点编号',\n"
      + "  `ticket_pickup_staff_lat` decimal(11,8) DEFAULT NULL COMMENT '揽收时快递员的纬度',\n"
      + "  `ticket_pickup_staff_lng` decimal(11,8) DEFAULT NULL COMMENT '揽收时快递员的经度',\n"
      + "  `ticket_delivery_id` bigint(20) unsigned DEFAULT NULL COMMENT '派件任务ID',\n"
      + "  `ticket_delivery_staff_info_id` int(10) unsigned DEFAULT NULL COMMENT '派件员工号',\n"
      + "  `ticket_delivery_store_id` varchar(10) DEFAULT NULL COMMENT '派件网点编号',\n"
      + "  `ticket_delivery_staff_lat` decimal(11,8) DEFAULT NULL COMMENT '派件时快递员的纬度',\n"
      + "  `ticket_delivery_staff_lng` decimal(11,8) DEFAULT NULL COMMENT '派件时快递员的经度',\n"
      + "  `state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '? 状态 1: 已揽收 2: 运输中 3: 派送中 4: 滞留中',\n"
      + "  `src_name` varchar(50) DEFAULT NULL COMMENT '寄件人姓名',\n"
      + "  `src_phone` varchar(20) DEFAULT NULL COMMENT '寄件人联系电话',\n"
      + "  `src_country_code` varchar(2) DEFAULT NULL COMMENT '寄件人国家编码',\n"
      + "  `src_province_code` varchar(4) DEFAULT NULL COMMENT '寄件人一级行政区划编码',\n"
      + "  `src_city_code` varchar(6) DEFAULT NULL COMMENT '寄件人二级行政区划编码',\n"
      + "  `src_district_code` varchar(8) DEFAULT NULL COMMENT '寄件人三级行政区划编码',\n"
      + "  `src_detail_address` varchar(300) DEFAULT NULL COMMENT '寄件人详细地址',\n"
      + "  `src_postal_code` varchar(20) DEFAULT NULL COMMENT '寄件人邮政编码',\n"
      + "  `dst_name` varchar(50) DEFAULT NULL COMMENT '收件人姓名',\n"
      + "  `dst_phone` varchar(20) DEFAULT NULL COMMENT '收件人联系电话',\n"
      + "  `dst_home_phone` varchar(20) DEFAULT NULL COMMENT '收件人家庭电话',\n"
      + "  `dst_country_code` varchar(2) DEFAULT NULL COMMENT '收件人国家编码',\n"
      + "  `dst_province_code` varchar(4) DEFAULT NULL COMMENT '收件人一级行政区划编码',\n"
      + "  `dst_city_code` varchar(6) DEFAULT NULL COMMENT '收件人二级行政区划编码',\n"
      + "  `dst_district_code` varchar(8) DEFAULT NULL COMMENT '收件人三级行政区划编码',\n"
      + "  `dst_district_default` tinyint(1) unsigned DEFAULT NULL COMMENT '是否为默认乡',\n"
      + "  `dst_detail_address` varchar(300) DEFAULT NULL COMMENT '收件人详细地址',\n"
      + "  `dst_postal_code` varchar(20) DEFAULT NULL COMMENT '收件人邮政编码',\n"
      + "  `dst_store_id` varchar(10) DEFAULT NULL COMMENT '目的地网点',\n"
      + "  `duty_store_id` varchar(10) DEFAULT NULL COMMENT '责任网点',\n"
      + "  `article_category` tinyint(3) unsigned DEFAULT NULL COMMENT '物品类型 0: 文件 1: 食品 2: 日用品 3: 数码产品 4: 衣物 5: 其它',\n"
      + "  `material_category` tinyint(3) unsigned DEFAULT NULL COMMENT '物料类型 0: 小号箱 1: 中号箱 2: 大号箱',\n"
      + "  `weight` int(10) unsigned DEFAULT NULL COMMENT '物品重量',\n"
      + "  `courier_weight` int(10) unsigned DEFAULT NULL COMMENT '快递员复秤物品重量',\n"
      + "  `store_keeper_weight` int(10) unsigned DEFAULT NULL COMMENT '仓管员复秤物品重量',\n"
      + "  `exhibition_weight` int(10) unsigned DEFAULT NULL COMMENT '展示物品重量',\n"
      + "  `store_weight` int(10) DEFAULT NULL COMMENT '网点重量',\n"
      + "  `length` int(10) unsigned DEFAULT NULL COMMENT '物品长度',\n"
      + "  `courier_length` int(10) unsigned DEFAULT NULL COMMENT '快递员复秤物品长度',\n"
      + "  `store_keeper_length` int(10) unsigned DEFAULT NULL COMMENT '仓管员复秤物品长度',\n"
      + "  `store_length` int(10) DEFAULT NULL COMMENT '网点包裹长度',\n"
      + "  `exhibition_length` int(10) unsigned DEFAULT NULL COMMENT '展示物品长度',\n"
      + "  `width` int(10) unsigned DEFAULT NULL COMMENT '物品宽度',\n"
      + "  `courier_width` int(10) unsigned DEFAULT NULL COMMENT '快递员复秤物品宽度',\n"
      + "  `store_keeper_width` int(10) unsigned DEFAULT NULL COMMENT '仓管员复秤物品宽度',\n"
      + "  `store_width` int(10) DEFAULT NULL COMMENT '网点包裹宽度',\n"
      + "  `exhibition_width` int(10) unsigned DEFAULT NULL COMMENT '展示物品长度',\n"
      + "  `height` int(10) unsigned DEFAULT NULL COMMENT '物品高度',\n"
      + "  `courier_height` int(10) unsigned DEFAULT NULL COMMENT '快递员复秤物品高度',\n"
      + "  `store_keeper_height` int(10) unsigned DEFAULT NULL COMMENT '仓管员复秤物品高度',\n"
      + "  `store_height` int(10) DEFAULT NULL COMMENT '网点包裹高度',\n"
      + "  `exhibition_height` int(10) unsigned DEFAULT NULL COMMENT '展示物品长度',\n"
      + "  `insured` tinyint(1) unsigned DEFAULT '0' COMMENT '是否保价 1: 保价 0: 不保价',\n"
      + "  `insure_declare_value` int(10) unsigned DEFAULT NULL COMMENT '寄件人申明物品金额',\n"
      + "  `discount_rate` int(10) unsigned DEFAULT NULL COMMENT '运费折扣率',\n"
      + "  `insure_amount` int(10) unsigned DEFAULT '0' COMMENT '保险费用',\n"
      + "  `material_amount` int(10) unsigned DEFAULT '0' COMMENT '物料费用',\n"
      + "  `label_amount` int(10) unsigned DEFAULT '0' COMMENT '面单费用',\n"
      + "  `freight_insure_enabled` tinyint(1) unsigned DEFAULT '0' COMMENT '是否购买运费险 0: 不买 1: 买',\n"
      + "  `freight_insure_amount` int(10) unsigned DEFAULT '0' COMMENT '预估运费险费用',\n"
      + "  `parcel_amount` int(10) unsigned DEFAULT '0' COMMENT '运费',\n"
      + "  `parcel_uniform_amount` int(10) unsigned DEFAULT '0' COMMENT '运费统一价',\n"
      + "  `courier_parcel_amount` int(10) unsigned DEFAULT '0' COMMENT '快递员复秤后运费',\n"
      + "  `store_keeper_parcel_amount` int(10) unsigned DEFAULT '0' COMMENT '仓管员复秤后运费',\n"
      + "  `pre_discount_parcel_amount` int(10) unsigned DEFAULT '0' COMMENT '折扣前运费',\n"
      + "  `store_parcel_amount` int(10) unsigned DEFAULT '0' COMMENT '网点运费',\n"
      + "  `parcel_amount_before` int(10) unsigned DEFAULT NULL COMMENT '优惠抵扣前运费金额',\n"
      + "  `coupon_deduction_amount` int(10) DEFAULT '0' COMMENT '优惠抵扣金额',\n"
      + "  `total_amount` int(10) unsigned DEFAULT '0' COMMENT '总费用',\n"
      + "  `courier_total_amount` int(10) unsigned DEFAULT '0' COMMENT '快递员复秤后总费用',\n"
      + "  `store_keeper_total_amount` int(10) unsigned DEFAULT '0' COMMENT '仓管员复秤后总费用',\n"
      + "  `store_total_amount` int(10) unsigned DEFAULT '0' COMMENT '网点总运费',\n"
      + "  `price_policy` int(10) DEFAULT NULL COMMENT '计费策略 1:重量计费 2:体积计费',\n"
      + "  `price_strategy` varchar(50) DEFAULT NULL COMMENT '价格策略',\n"
      + "  `client_grade` int(10) DEFAULT NULL COMMENT '客户等级',\n"
      + "  `insure_rate` int(10) unsigned DEFAULT '0' COMMENT '保价费折扣率',\n"
      + "  `same_province` tinyint(1) unsigned DEFAULT NULL COMMENT '省内省外 1：省内 0：省外',\n"
      + "  `upcountry` tinyint(1) unsigned DEFAULT NULL COMMENT '是否偏远地区',\n"
      + "  `upcountry_amount` int(10) unsigned DEFAULT '0' COMMENT '偏远地区附加费',\n"
      + "  `cod_enabled` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否有COD(1:有 0:没有)',\n"
      + "  `cod_amount` int(10) unsigned DEFAULT '0' COMMENT 'cod金额',\n"
      + "  `cod_settlement_category` tinyint(3) unsigned DEFAULT NULL COMMENT 'COD结算方式',\n"
      + "  `cod_uniform_amount` int(10) unsigned DEFAULT NULL COMMENT 'COD统一价',\n"
      + "  `cod_poundage_rate` int(10) unsigned DEFAULT NULL COMMENT 'cod 手续费费率(千分位)',\n"
      + "  `cod_poundage_amount` int(10) unsigned DEFAULT '0' COMMENT 'cod手续费',\n"
      + "  `cod_poundage_minimum` int(10) unsigned DEFAULT NULL COMMENT 'cod 手续费最小值',\n"
      + "  `handover_thailandpost_enabled` tinyint(1) unsigned DEFAULT '0' COMMENT '是否要交接邮政 1: 是 0: 否',\n"
      + "  `bar_code` varchar(32) DEFAULT NULL COMMENT '泰国邮政运单号',\n"
      + "  `settlement_category` tinyint(1) DEFAULT NULL COMMENT '结算方式: 1 现场 2 定期',\n"
      + "  `settlement_type` tinyint(1) DEFAULT NULL COMMENT '结算类型: 1 寄付 2 到付',\n"
      + "  `returned` tinyint(1) unsigned DEFAULT '0' COMMENT '是否退货件 0: 正常件 0: 退货件',\n"
      + "  `returned_pno` varchar(20) DEFAULT NULL COMMENT '退货运单号',\n"
      + "  `customary_pno` varchar(20) DEFAULT NULL COMMENT '原运单号',\n"
      + "  `signer_category` tinyint(1) DEFAULT NULL COMMENT '签收人类型',\n"
      + "  `signer_content` varchar(50) DEFAULT NULL COMMENT '签收备注',\n"
      + "  `interrupt_category` tinyint(3) unsigned DEFAULT NULL COMMENT '中断标记',\n"
      + "  `discard_enabled` tinyint(1) unsigned DEFAULT '0' COMMENT '是否丢弃包裹',\n"
      + "  `detained_marker_category` tinyint(3) unsigned DEFAULT NULL COMMENT '货件留仓原因',\n"
      + "  `cancel_marker_category` tinyint(3) unsigned DEFAULT NULL COMMENT '撤销包裹原因',\n"
      + "  `cancel_remark` varchar(500) DEFAULT NULL COMMENT '撤销包裹备注',\n"
      + "  `parcel_note` varchar(500) DEFAULT NULL COMMENT '包裹备注',\n"
      + "  `printing_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '包裹打印次数',\n"
      + "  `desired_at` datetime DEFAULT NULL COMMENT '预估交接时间',\n"
      + "  `finished_at` datetime DEFAULT NULL COMMENT '妥投时间',\n"
      + "  `state_change_at` datetime(3) DEFAULT NULL COMMENT '状态变更时间',\n"
      + "  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,\n"
      + "  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
      + "  PRIMARY KEY (`pno`),\n"
      + "  UNIQUE KEY `unidx_recent_pno` (`recent_pno`),\n"
      + "  KEY `idx_client_id` (`client_id`),\n"
      + "  KEY `idx_pkg_code` (`pkg_code`),\n"
      + "  KEY `idx_ticket_pickup_id` (`ticket_pickup_id`),\n"
      + "  KEY `idx_agent_id` (`agent_id`),\n"
      + "  KEY `idx_cod_client_id` (`cod_client_id`),\n"
      + "  KEY `idx_finished_at` (`finished_at`),\n"
      + "  KEY `idx_created_at_staff` (`created_at`,`ticket_pickup_staff_info_id`)\n"
      + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='运单信息表'";


  public static final String ALTER_DDL = "alter table sorting_info add column sorting_machine_no varchar(10) default null comment '分拣机序号' after device_model";
}
