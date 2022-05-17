//Your code here
def height= 50
CSG myCylinder = new Cylinder(20, // Radius at the bottom
                      		10, // Radius at the top
                      		height+2, // Height
                      		(int)60 //resolution
                      		).toCSG()//convert to CSG to dispr

CSG sphereHighRes = new Sphere(15,// Spheres radius
						40,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display
						.movez(height+20)
CSG TwoRoundedCylinder = new RoundedCylinder(30,10)
                                .cornerRadius(5)// sets the radius of the corner
                                .toCSG()// converts it to a CSG tor display
                               
CSG UpperRoundedCylinder = new RoundedCylinder(15,10.0)
                                .cornerRadius(7)// sets the radius of the corner
                                .toCSG()// converts it to a CSG tor display
                                .movez(height)
CSG OneRoundedCylinder = new RoundedCylinder(7,10)
                                .cornerRadius(10)
                                .toCSG()// converts it to a CSG tor display
                                .movez(10)
                                

CSG Bottom= OneRoundedCylinder.union(TwoRoundedCylinder).hull();


CSG allUnion = CSG.unionAll([myCylinder, sphereHighRes, UpperRoundedCylinder, Bottom])

return (allUnion)