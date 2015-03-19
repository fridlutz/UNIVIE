drop table Kurs;
drop table Teilnehmer;
drop table Angebot;
drop table Kursleiter;
drop table Vorauss;
drop table Nimmt_teil;
drop table Fuehrt_durch;
drop table Gebuehren;
drop table KursLit;




create table Kurs( 
   KursNr varchar (3) not null, 
   Titel  varchar (20));


insert into Kurs values('G08', 'Grundlagen I');
insert into Kurs values('G10', 'Grundlagen II');
insert into Kurs values('P13', 'C-Programmierung');
insert into Kurs values('I09', 'Datenbanken');




create table Teilnehmer( 
   TnNr integer, 
   Name varchar(12), 
   Ort  varchar(12));


insert into Teilnehmer values(143, 'Schmidt, M.', 'Bremen');
insert into Teilnehmer values(145, 'Huber, Chr.', 'Augsburg');
insert into Teilnehmer values(146, 'Abele, I.', 'Senden');
insert into Teilnehmer values(149, 'Kircher, B.', 'Bochum');
insert into Teilnehmer values(155, 'Meier, W.', 'Stuttgart');
insert into Teilnehmer values(171, 'Moeller, H.', 'Ulm');
insert into Teilnehmer values(173, 'Schulze, B.', 'Stuttgart');
insert into Teilnehmer values(177, 'Mons, F.', 'Essen');
insert into Teilnehmer values(185, 'Meier, K.', 'Heidelberg');
insert into Teilnehmer values(187, 'Karstens, L.', 'Hamburg');
insert into Teilnehmer values(194, 'Gerstner, M.', 'Ulm');




create table Angebot( 
   AngNr  integer not null, 
   KursNr varchar (3) not null, 
   Datum  date, 
   Ort    varchar(12));


insert into Angebot values(1, 'G08', '13.10.2009', 'Muenchen');
insert into Angebot values(2, 'G08', '24.11.2009', 'Bremen');
insert into Angebot values(1, 'G10', '01.12.2009', 'Muenchen');
insert into Angebot values(2, 'G10', '15.02.2009', 'Hamburg');
insert into Angebot values(1, 'P13', '28.05.2009', 'Ulm');
insert into Angebot values(2, 'P13', '01.07.2009', 'Essen');
insert into Angebot values(1, 'I09', '27.03.2009', 'Stuttgart');
insert into Angebot values(2, 'I09', '23.04.2009', 'Hamburg');
insert into Angebot values(3, 'I09', '29.05.2009', 'Muenchen');




create table Kursleiter( 
   PersNr integer not null, 
   Name   varchar(12), 
   Gehalt real);


insert into Kursleiter values(27183, 'Meier, I.', 4300.50);
insert into Kursleiter values(29594, 'Schulze, H.', 3890.20);
insert into Kursleiter values(38197, 'Huber, L.', 4200.10);
insert into Kursleiter values(43325, 'Mueller, K.', 3400.80);


create table Vorauss( 
   VorNr  varchar(3) not null,  
   KursNr varchar(3) not null);


insert into Vorauss values('G08', 'P13');
insert into Vorauss values('G10', 'P13');
insert into Vorauss values('G08', 'I09');
insert into Vorauss values('G10', 'I09');
insert into Vorauss values('P13', 'I09');




create table Nimmt_teil( 
   AngNr  integer not null, 
   KursNr varchar(3) not null, 
   TnNr   integer not null);


insert into Nimmt_teil values(2, 'G08', 143);
insert into Nimmt_teil values(2, 'P13', 143);
insert into Nimmt_teil values(1, 'G08', 145);
insert into Nimmt_teil values(1, 'P13', 146);
insert into Nimmt_teil values(1, 'I09', 146);
insert into Nimmt_teil values(2, 'P13', 149);
insert into Nimmt_teil values(1, 'I09', 155);
insert into Nimmt_teil values(1, 'I09', 171);
insert into Nimmt_teil values(1, 'I09', 173);
insert into Nimmt_teil values(2, 'P13', 177);
insert into Nimmt_teil values(1, 'I09', 185);
insert into Nimmt_teil values(2, 'I09', 187);
insert into Nimmt_teil values(1, 'P13', 194);




create table Fuehrt_durch( 
   AngNr    integer not null, 
   KursNr   varchar(3) not null, 
   PersNr   integer);


insert into Fuehrt_durch values(1, 'G08', 38197);
insert into Fuehrt_durch values(2, 'G08', 38197);
insert into Fuehrt_durch values(1, 'G10', 43325);
insert into Fuehrt_durch values(2, 'G10', 29594);
insert into Fuehrt_durch values(1, 'P13', 27183);
insert into Fuehrt_durch values(2, 'P13', 27183);
insert into Fuehrt_durch values(1, 'I09', 29594);
insert into Fuehrt_durch values(2, 'I09', 29594);
insert into Fuehrt_durch values(3, 'I09', 29594);




create table Gebuehren( 
   AngNr    integer not null, 
   KursNr   varchar(3) not null, 
   TnNr     integer not null,
   Gebuehr  real);


insert into Gebuehren values(2, 'G08', 143, 500);
insert into Gebuehren values(2, 'P13', 143, 400);
insert into Gebuehren values(1, 'G08', 145, NULL);
insert into Gebuehren values(1, 'P13', 146, 300);
insert into Gebuehren values(1, 'I09', 146, NULL);
insert into Gebuehren values(2, 'P13', 149, 350);
insert into Gebuehren values(1, 'I09', 155, NULL);
insert into Gebuehren values(1, 'I09', 171, NULL);
insert into Gebuehren values(1, 'I09', 173, 400);
insert into Gebuehren values(2, 'P13', 177, NULL);
insert into Gebuehren values(1, 'I09', 185, 450);
insert into Gebuehren values(2, 'I09', 187, NULL);
insert into Gebuehren values(1, 'P13', 194, NULL);




create table KursLit( 
   KursNr   varchar(3) not null, 
   Bestand  integer,
   Bedarf   integer,
   Preis    real);


insert into KursLit values('G08', 4, 2, 10.50);
insert into KursLit values('I09', 2, 6, 8.00);
insert into KursLit values('P13', 3, 5, 15.20);


commit;