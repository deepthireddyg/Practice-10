public class Queries {
    //finding names of sailors who reserved boat no 3
   //select sname from sailors,reserves where sailors.sid=reserves.sid and bid=3;
    //finding names of sailors who reserved red boat
  //select sname from sailors,reserves,boat where sailors.sid=reserves.sid and reserves.bid=boats.
    //boat.bid and boat.color='red';

    //finding colors of  boats   reserved by 'sandeep'
 //select colors from boat,reserves,sailors where boats.bid=reserve.bid and reserves.sid=sailors.sid and sailors.sname='sandeep';
//select sname from sailors ,reserves,boat where sailors.sid=reserves.sid and reserves.bid=boat.bid

    //finding names of sailors who have atleast one boat.

    //view:single table
    //create view cse_students as select * from student where branch='cse';
    //create view eee_students as select * from student where branch='eee';

    //multiple tables:
    //create view student_contact as select student.sid,studetn.sname,contact.email,contact.mobile from student where student.sid=contact.sid;
// delete view table;
    //drop view student_contact;


}

