DROP TABLE IF EXISTS `goods_supplier_tb`;
CREATE TABLE `goods_supplier_tb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '����',
  `supplier_name` varchar(256) DEFAULT NULL COMMENT '��Ӧ������',
  `supplier_short_name` varchar(128) DEFAULT NULL COMMENT '��Ӧ�̼��',
  `supplier_english_name` varchar(128) DEFAULT NULL COMMENT '��Ӧ��Ӣ����',
  `linkman_name` varchar(64) DEFAULT NULL COMMENT '��ϵ������',
  `linkman_sex` int(11) DEFAULT NULL COMMENT '��ϵ���Ա�',
  `linkman_age` int(11) DEFAULT NULL COMMENT '��ϵ������',
  `supplier_address` varchar(512) DEFAULT NULL COMMENT '��Ӧ�����ڵأ�ʡ���أ�������',
  `business_scope` bigint(20) DEFAULT NULL COMMENT 'Ӫҵ��Χ',
  `linkman_phone` varchar(32) DEFAULT NULL COMMENT '��ϵ���ֻ���',
  `link_email` varchar(64) DEFAULT NULL COMMENT '��ϵ����',
  `business_type` bigint(20) DEFAULT NULL COMMENT '��ҵ����',
  `state` int(1) DEFAULT NULL COMMENT '״̬(0��ͣ�ã�1����)',
  `is_delete` int(1) DEFAULT NULL COMMENT '�Ƿ�ɾ��(0����;1����)',
  `creator_id` bigint(20) DEFAULT NULL COMMENT '������ID',
  `creator` varchar(255) DEFAULT NULL COMMENT '������',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
  `updator_id` bigint(20) DEFAULT NULL COMMENT '�޸���ID',
  `updator` varchar(255) DEFAULT NULL COMMENT '�޸���',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '�޸�ʱ��',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
