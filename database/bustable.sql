

create table bus(busid integer primary key auto_increment,
				busno varchar(50),
				source varchar(50),
				destination varchar(50),
                date date,
				time varchar(50),
				amount varchar(50),
				thumbnail varchar(300));


INSERT INTO bus VALUES(default,'MH-12-7051','Pune','Aurangabad','2022-01-15','7 pm','2500','bus1.png');
INSERT INTO bus VALUES(default,'MH-24-7052','Pune','Latur','2022-01-15','7 pm','2500','bus5.png' );
INSERT INTO bus VALUES(default,'GJ-05-7050','Pune','Surat','2022-01-17','8 pm','150','bus3.png' );
INSERT INTO bus VALUES(default,'MH-12-7060','Pune','Vadodara','2022-01-16','9 pm','1200','bus2.png' );
INSERT INTO bus VALUES(default,'MH-24-7060','Pune','Latur','2022-01-15','7 pm','950','bus5.png' );
INSERT INTO bus VALUES(default,'MH-12-7064','Pune','Latur','2022-01-15','8 pm','900','bus2.Jpg' );
INSERT INTO bus VALUES(default,'MH-12-7086','Pune','Latur','2022-01-17','7 pm','1000','bus5.png' );
INSERT INTO bus VALUES(default,'MH-24-7040','Pune','Latur','2022-01-18','9 pm','850','bus1.jpg' );
INSERT INTO bus VALUES(default,'MH-12-7053','Pune','Latur','2022-01-18','8 pm','950','bus3.jpg' );
INSERT INTO bus VALUES(default,'MH-24-7055','Pune','Latur','2022-01-20','7 pm','1400','bus1.jpg' );
INSERT INTO bus VALUES(default,'KA-22-7058','Pune','Balgavi','2022-01-17','10 pm','1500','bus8.jpg' );
INSERT INTO bus VALUES(default,'MH-12-7059','Pune','Solapur','2022-01-20','9 pm','2500','bus9.png' );
INSERT INTO bus VALUES(default,'MH-26-7052','Pune','Amravati','2022-01-21','8 pm','1450','bus10.jpg' );
INSERT INTO bus VALUES(default,'MH-12-7060','Pune','Goa','2022-01-15','7 pm','2500','bus5.png' );
INSERT INTO bus VALUES(default,'MH-20-7063','Pune','Aurangabad','2022-01-25','7 pm','2500','bus11.jpg' );
INSERT INTO bus VALUES(default,'MH-15-7060','Pune','Nashik','2022-01-24','7 pm','1100','bus12.png' );
INSERT INTO bus VALUES(default,'MH-12-7063','Pune','Kolhapur','2022-01-18','7 pm','1900','bus12.png' );
INSERT INTO bus VALUES(default,'MH-12-7062','Pune','Hubali','2022-01-18','7 pm','1800','bus4.png' );


INSERT INTO bus VALUES(default,'MH-12-2510','Mumbai','Pune','2022-01-18','7 pm','400','bus12.jpg' );
INSERT INTO bus VALUES(default,'MH-01-2525','Mumbai','Ahemdabad','2022-01-19','8 pm','800','bus01.jpg' );
INSERT INTO bus VALUES(default,'GJ-06-2527','Mumbai','Vadodara','2022-01-18','7 pm','400','bus12.jpg' );
INSERT INTO bus VALUES(default,'MH-01-2556','Mumbai','Rajkot','2022-01-20','6 pm','1000','bus09.jpg' );
INSERT INTO bus VALUES(default,'MH-44-2425','Mumbai','jalgaon','2022-01-20','9 pm','1200','bus13.jpg' );
INSERT INTO bus VALUES(default,'MH-12-2756','Mumbai','Indore','2022-01-19','7 pm','2500','bus11.jpg' );
INSERT INTO bus VALUES(default,'MH-01-2444','Mumbai','Shirdi','2022-01-25','8 pm','1300','bus14.jpg' );
INSERT INTO bus VALUES(default,'TS-09-2522','Mumbai','Hyderabad','2022-01-19','7 pm','400','bus14.jpg' );
INSERT INTO bus VALUES(default,'MH-01-2530','Mumbai','Banglore','2022-01-20','9 pm','2200','bus15.jpg' );


INSERT INTO bus VALUES(default,'KA-01-3235','Banglore','Madurai','2022-01-20','6 pm','1500','bus16.jpg' );
INSERT INTO bus VALUES(default,'KA-01-3333','Banglore','Tirupati','2022-01-20','6 pm','1500','bus16.jpg' );
INSERT INTO bus VALUES(default,'KA-01-3664','Banglore','Chennai','2022-01-20','6 pm','1500','bus16.jpg' );
INSERT INTO bus VALUES(default,'MH-12-3994','Banglore','Goa','2022-01-20','6 pm','1500','bus17.jpg' );
INSERT INTO bus VALUES(default,'KA-01-3421','Banglore','Tiruchirapalli','2022-01-20','6 pm','1500','bus18.jpg' );
INSERT INTO bus VALUES(default,'MH-12-2527','Banglore','Hubali','2022-01-20','6 pm','1500','bus19.jpg' );
INSERT INTO bus VALUES(default,'MH-12-2527','Banglore','Vijapur','2022-01-20','6 pm','1500','bus20.jpg' );
INSERT INTO bus VALUES(default,'KA-01-2527','Banglore','Madurai','2022-01-20','7 pm','1400','bus16.png' );


INSERT INTO bus VALUES(default,'MH-12-2527','Nashik','Pune','2022-01-20','8 pm','1500','bus21.jpg' );
INSERT INTO bus VALUES(default,'MH-20-2527','Nashik','Aurangabad','2022-01-19','9 pm','2300','bus22.jpg' );
INSERT INTO bus VALUES(default,'MH-15-2527','Nashik','Jalgaon','2022-01-21','8 pm','1700','bus223.jpg' );
INSERT INTO bus VALUES(default,'MH-24-2527','Nashik','Latur','2022-01-20','8 pm','1850','bus24.jpg' );
INSERT INTO bus VALUES(default,'MH-15-2527','Nashik','Jammnagar','2022-01-20','9 pm','1500','bus21.png' );


INSERT INTO bus VALUES(default,'DL-01-5527','Delhi','Lucknow','2022-01-20','8 pm','1250','bus24.jpg' );
INSERT INTO bus VALUES(default,'DL-02-5547','Delhi','Manali','2022-01-21','9 pm','2700','bus25.jpg' );
INSERT INTO bus VALUES(default,'DL-01-5427','Delhi','Amritsar','2022-01-22','10 pm','1700','bus26.jpg' );
INSERT INTO bus VALUES(default,'DL-03-5307','Delhi','Shimla','2022-01-21','9 pm','3700','bus27.jpg' );
INSERT INTO bus VALUES(default,'DL-04-5727','Delhi','Dehradun','2022-01-22','8 pm','2500','bus28.jpg' );
INSERT INTO bus VALUES(default,'DL-01-5894','Delhi','Jodhpur','2022-01-23','8 pm','2100','bus25.jpg' );
INSERT INTO bus VALUES(default,'DL-03-5544','Delhi','Agra','2022-01-27','5 pm','4770','bus26.jpg' );
INSERT INTO bus VALUES(default,'DL-02-5572','Delhi','Bikaner','2022-01-22','9 pm','980','bus27.jpg' );
INSERT INTO bus VALUES(default,'DL-01-5445','Delhi','Chandigarh','2022-01-25','9 pm','3200','bus28.jpg' );

INSERT INTO bus VALUES(default,'MH-31-6010','Nagpur','Pune','2022-01-22','8 pm','1850','bus29.jpg' );
INSERT INTO bus VALUES(default,'TS-09-6065','Nagpur','Hyderabad','2022-01-23','9 pm','1250','bus30.png' );
INSERT INTO bus VALUES(default,'MH-24-6062','Nagpur','Latur','2022-01-22','8 pm','1150','bus31.jpg' );
INSERT INTO bus VALUES(default,'MH-31-6064','Nagpur','Jabalpur','2022-01-22','8 pm','1150','bus32.jpg' );
INSERT INTO bus VALUES(default,'MH-31-6065','Nagpur','Dhule','2022-01-23','9 pm','1050','bus33.png' );
INSERT INTO bus VALUES(default,'MH-31-6071','Nagpur','Bhusawal','2022-01-20','7 pm','1350','bus34.jpg' );
INSERT INTO bus VALUES(default,'MH-31-6068','Nagpur','Nanded','2022-01-24','8 pm','1500','bus35.jpg' );
INSERT INTO bus VALUES(default,'MH-20-6061','Nagpur','Aurangabad','2022-01-22','9 pm','1150','bus31.jpg' );

INSERT INTO bus VALUES(default,'GJ-23-1120','Anand','Surat','2022-01-22','6 pm','900','bus32.jpg' );
INSERT INTO bus VALUES(default,'GJ-05-1121','Anand','Pune','2022-01-23','6 pm','950','bus33.jpg' );
INSERT INTO bus VALUES(default,'GJ-06-1122','Anand','Bhuj','2022-01-22','7 pm','850','bus34.jpg' );
INSERT INTO bus VALUES(default,'GJ-23-1125','Anand','Indore','2022-01-22','8 pm','1000','bus35.jpg' );
INSERT INTO bus VALUES(default,'GJ-06-1127','Anand','Mumbai','2022-01-21','6 pm','950','bus36.jpg' );
INSERT INTO bus VALUES(default,'GJ-06-2211','Anand','Jalgaon','2022-01-22','8 pm','1200','bus37.png' );
INSERT INTO bus VALUES(default,'GJ-06-1124','Anand','Jodhpur','2022-01-24','9 pm','1100','bus38.jpg' );
INSERT INTO bus VALUES(default,'GJ-05-1137','Anand','Junagadh','2022-01-23','7 pm','600','bus39.jpg' );
INSERT INTO bus VALUES(default,'GJ-23-1144','Anand','Rajkot','2022-01-24','6 pm','1400','bus40.jpg' );
