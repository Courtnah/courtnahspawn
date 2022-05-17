//Your code here
CSG myCylinder = new Cylinder(20, // Radius at the bottom
                      		10, // Radius at the top
                      		40, // Height
                      		(int)30 //resolution
                      		).toCSG()//convert to CSG to dispr

CSG sphereHighRes = new Sphere(25,// Spheres radius
						40,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display
return [myCylinder, sphereHighRes]