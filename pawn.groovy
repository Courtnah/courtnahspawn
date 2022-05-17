//Your code here
def height= 40
CSG myCylinder = new Cylinder(20, // Radius at the bottom
                      		10, // Radius at the top
                      		height, // Height
                      		(int)60 //resolution
                      		).toCSG()//convert to CSG to dispr

CSG sphereHighRes = new Sphere(20,// Spheres radius
						40,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display
						.movez(height)
CSG roundedCylinder = new RoundedCylinder(40,15)
                                .cornerRadius(10)// sets the radius of the corner
                                .toCSG()// converts it to a CSG tor display
CSG UpperRoundedCylinder = new RoundedCylinder(40,15.0)
                                .cornerRadius(10)// sets the radius of the corner
                                .toCSG()// converts it to a CSG tor display

return [myCylinder, sphereHighRes, roundedCylinder, UpperRoundedCylinder]