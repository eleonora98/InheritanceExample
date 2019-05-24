# InheritanceExample
A task about vehicles and cars, based on inheritance in Java.

An ELECTRIC_CAR is characterised by: 
- The brand 
- The model name 
- The power of the engine  
- The capacity of the battery 
- The price  

 A GAS_CAR is characterised by:  
- The brand 
- The model name 
- The engine displacement 
- The power of the engine 
- The price 

 A HYBRID_CAR is characterised by1: 
- The brand
- The model name
- The engine displacement
- The power of the engine
- The capacity of the battery
- The price 

The program must compile and outputs with the same format:
ELECTRIC_CAR Tesla, Model 3, 150KW, 50000Ah, 30000 euro 
GAS_CAR Honda, Civic, 1.5L, 80KW, 18000 euro
HYBRID_CAR Toyota, Prius, 1.5L, 50KW, 12000Ah, 24000 euro

For solving, first we create class Vehicle, then we create classes ElectricCar and GasCar, which inherit from Vehicle.
The attributes in class Vehicle are: the brand, the model, the power of engine and the price. They are common for all three types of cars.
In the class ElectricCar we should add only one more attribute - The capacity of the battery
In the class GasCar we should also add one more attribute - but this time - The engine displacement 
Then we create class HybridCar that inherits from GasCar - this way it has the attrbutes and methods from clas Vehicle (since
GasCar inherits from Vehicle), and also from class GasCar. So we add the attribute that GasCar does not contain - The capacity of the battery.
