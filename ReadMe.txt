Program Description
-----
This program will take the equations found during a mesh analysis of a simple circuit and calculate the current through each loop of the circuit.


Input Analysis
-----
The input will be taken from the console. The input will consist of the the type of circuit (DC or AC), the total number of loops, and the equations for each loop. This input will be formatted in the following way:
- circuitType
- ComplexType (If circuitType = "AC")
- totalLoops
- mesh[n]

The ranges for the input values are as follows:
- circuitType :"DC" or "AC"
- complexType :"Polar" or "Rect"
- totalLoops  :1-5

The following is sample input for the program. The double slashes and text after it serves as a description of each line, and is not included in the input.

DC			//program will use real numbers for the circuit analysis
2			//two loops in the circuit
6-2 = 28	//equation for mesh one
-2 +3 = -7	//equation for mesh two


Output Analysis
-----

Each line of the output will give the value of the current though each loop. 

The following is sample output for the program. The double slashes and text after it serves as a description of each line, and is not included in the output.

I1 = 5		//current in amps through mesh one
I2 = 1		//current in amps through mesh two