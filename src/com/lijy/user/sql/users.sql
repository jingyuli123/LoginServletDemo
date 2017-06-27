/*
SQLyog Community v10.3 
MySQL - 5.0.67-community-nt 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `users` (
	`id` int (11),
	`username` varchar (36),
	`password` varchar (24)
); 
insert into `users` (`id`, `username`, `password`) values('1','lisi','123');
insert into `users` (`id`, `username`, `password`) values('2','刘正','345');
insert into `users` (`id`, `username`, `password`) values('5','uu','122');

create table `department` (
	`deptname` varchar (60),
	`description` varchar (300)
); 
insert into `department` (`deptname`, `description`) values('Java教学部','ckeditor');