select * from t_homework;

select tl.name, tl.updatedAt, th.name, th.description
from t_lesson as tl join t_homework as th on tl.homework_id=th.id;

select tl.name, tl.updatedAt, th.name, th.description
from t_lesson as tl join t_homework as th on tl.homework_id=th.id order by tl.updatedAt;

select ts.name,ts.updatedAt,tl.name,tl.updatedAt
from t_schedule as ts
join t_lesson_schedule as tls on ts.id=tls.schedule_id
join t_lesson as tl on tl.id=tls.schedule_id;

select ts.name,count(tl.name)
from t_schedule as ts
join t_lesson_schedule as tls on ts.id=tls.schedule_id
join t_lesson as tl on tl.id=tls.schedule_id
group by ts.name;
