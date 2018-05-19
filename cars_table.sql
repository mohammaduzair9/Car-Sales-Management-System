Create Table Cars
(
Id int primary key identity ,
Make varchar (20) NOT NULL  ,
Model varchar(20) NOT NULL,
Year int NOT NULL,
Body_type varchar (20) NOT NULL ,
Fuel_type varchar (20) NOT NULL ,
Drive_type varchar (20) NOT NULL ,
Cylinder int NOT NULL ,
Price money NOT NULL ,
Km int NOT NULL ,
Engine_size int NOT NULL ,
Doors int NOT NULL ,
Seats int  NOT NULL ,
Transmission varchar (15) NOT NULL ,
Color varchar (20) NOT NULL ,
Air_conditioning bit,
Anti_lock_braking bit ,
Brake_assist bit ,
Power_steering bit ,
Power_mirror bit ,
Mobile_phone_con bit ,
Trip_comp bit ,
Central_lock bit ,
Rear_spoiler bit ,
Parking_distance_cont bit ,
Hill_holder bit ,
Engine_immobilizer bit ,
Cloth_trim bit ,
Dual_airbag bit ,
Usb_input bit ,
Intermittent_wipers bit ,
Map_reading_lamps bit ,
Leather_steering_wheel bit ,
Halogen_headlights bit ,
Img varchar(max) ,

)



insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('AUDI','A6 MY14 multitronic'	,2014	,'Sedan'	,'Diesel'	,'Front'	,4			,6850000	,1750	,1968			,4		,5		,'Manual'		,'White'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\AUDI A6 MY14 multitronic.jpg'	,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,1					,1					,1						,1				,1				,1				,0			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('MAZDA','GT MY-14'				,2014	,'Sedan'	,'Diesel'	,'Rear'		,4			,4350000	,21731	,2200			,4		,5		,'Automatic'	,'Red'		,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\MAZDA GT MY14.jpg'			,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,0					,1					,1						,1				,1				,1				,1			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('NISSAN','Qashqai J11 ST'		,2014	,'SUV'		,'Diesel'	,'Front'	,4			,3020000	,5322	,2000			,5		,5		,'Manual'		,'White'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\NISSAN QASHQAI J11 ST.jpg'	,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,1					,1					,1						,1				,1				,1				,1			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('BMW'	,'I8 Spyder'			,2014	,'Convertible','Diesel'	,'Rear'		,6			,5500000	,14250	,3500			,4		,4		,'Automatic'	,'Silver'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\BMW SpyderI8'					,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,1					,1					,1						,1				,1				,1				,0			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('HYUNDAI','Bizquest411'		,2014	,'Sedan'	,'Petrol'	,'Front'	,3			,1150000	,17250	,1300			,4		,5		,'Manual'		,'Orange'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\HYUNDAI Bizquest411.jpg'		,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,1					,0					,0						,1				,1				,0				,1			,0			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('HYUNDAI','Bizquest411'		,2014	,'Sedan'	,'Petrol'	,'Front'	,3			,1150000	,17250	,1300			,4		,5		,'Manual'		,'Orange'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\HYUNDAI Bizquest411.jpg'		,1					,1					,1				,1				,0			,1				,1					,0					,1				,1						,1						,1					,0					,0						,1				,1				,0				,1			,0			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('KIA','Optima LX'				,2015	,'Sedan'	,'CNG'		,'4WD'		,6			,3500000	,0		,2400			,4		,5		,'Automatic'	,'Smokey Blue'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\KIA OptimaLX.jpg'			,1					,1					,1				,1				,0			,1				,1					,0					,0				,1						,1						,1					,0					,0						,1				,1				,0				,1			,0			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('HONDA','CR-V'					,2012	,'SUV'		,'Petrol'	,'Front'	,4			,2220000	,1957	,2100			,4		,5		,'Manual'		,'Brown'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\HONDA CRV.jpg'				,1					,1					,1				,1				,1			,1				,0					,1					,0				,1						,1						,1					,0					,0						,1				,1				,1				,0			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('BMW'	,'640i'					,2015	,'Coupe'	,'Diesel'	,'Rear'		,8			,7800000	,1540	,4000			,2		,4		,'Automatic'	,'Red'		,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\BMW 640i.jpg'					,1					,1					,1				,1				,1			,1				,1					,1					,1				,1						,1						,1					,0					,1						,1				,1				,1				,1			,1			);

insert into Cars(Make	,Model					,Year	,Body_type	,Fuel_type	,Drive_type	,Cylinder	,Price		,Km		,Engine_size	,Doors	,Seats	,Transmission	,Color		,Img																								,Air_conditioning	,Anti_lock_braking	,Brake_assist	,Central_lock	,Cloth_trim	,Dual_airbag	,Engine_immobilizer	,Halogen_headlights	,Hill_holder	,Intermittent_wipers	,Leather_steering_wheel	,Map_reading_lamps	,Mobile_phone_con	,Parking_distance_cont	,Power_mirror	,Power_steering	,Rear_spoiler	,Trip_comp	,Usb_input	)
values			('HYUNDAI','SANTRO XING GLS'	,2009	,'hatchback','LPG'		,'Front'	,4			,400000		,21957	,1200			,4		,5		,'Manual'		,'Golden'	,'C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\CarImages\HYUNDAI Santro.jpg'				,1					,0					,0				,1				,0			,0				,0					,0					,0				,1						,1						,0					,0					,0						,1				,1				,0				,0			,0			);


select * from Cars