-- 创建学生表
CREATE TABLE `student` (
  `id` int(11) NOT NULL COMMENT '学生编号',
  `name` varchar(64) NOT NULL COMMENT '学生姓名',
  `sex` varchar(10) NOT NULL COMMENT '学生性别',
  `age` int(11) NOT NULL COMMENT '学生年龄',
  `address` varchar(256) NOT NULL COMMENT '学生家庭住址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
