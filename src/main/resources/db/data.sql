INSERT INTO `user` (id, username, password, role) VALUES ('1', 'root', '1234', 'admin');
INSERT INTO `user` (id, username, password, role) VALUES ('2', 'user', '1234', 'user');
INSERT INTO `user` (id, username, password, role) VALUES ('3', 'user1', '1234', 'user');
INSERT INTO `user` (id, username, password, role) VALUES ('4', 'user2', '1234', 'user');
INSERT INTO `user` (id, username, password, role) VALUES ('5', 'user3', '1234', 'user');
INSERT INTO `user` (id, username, password, role) VALUES ('6', 'user4', '1234', 'user');
INSERT INTO `user` (id, username, password, role) VALUES ('7', '测试', '1234', 'user');


INSERT INTO `file` (`file_name`, file_type, file_size) VALUES ('1.mp4','video', 200);
INSERT INTO `file` (`file_name`, file_type, file_size) VALUES ('1.jpg', 'picture', 200);
INSERT INTO `file` (`file_name`, file_type, file_size) VALUES ('1.doc', 'document', 2200);
INSERT INTO `file` (`file_name`, file_type, file_size) VALUES ('1.txt', 'text', 2100);


INSERT INTO `llz` (llzname, llzpassword, llzemail, llzphone) VALUES ('llz','123456', '2375685919@qq.com', '13995953370');
COMMIT;