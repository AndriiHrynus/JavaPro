create table t_homework(
        id int primary key auto_increment,
        name varchar(256) not null,
        description varchar(256) not null
);
create table t_lesson(
        id int primary key auto_increment,
        name varchar(256) not null,
        updatedAt varchar(256) not null,
        homework_id  int unique,
        foreign key (homework_id) references t_homework(id)
);
create table t_schedule(
        id int primary key auto_increment,
        name varchar(256) not null,
        updatedAt varchar(256) not null
);
create table t_lesson_schedule(
         lesson_id int,
         schedule_id int,
         foreign key (lesson_id) references t_lesson(id),
         foreign key (schedule_id) references t_schedule(id)
);
