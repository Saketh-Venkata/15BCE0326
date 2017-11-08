# 15BCE0326
# 15BCE0343
# 15BCE0671

Compile all the files in the 'Code' directory using ‘javac *.java’.

To run the program usage is: 

java pj2 <cores=n> GraphColSmp <fileName> for the parallel version
where the number of cores are optional (default=1 core).

Example:
  1)  java pj2 cores=2 GraphColSmp Sample.txt ---> Sample.txt is uploaded and it is of 20 nodes
  2)  java pj2 cores=2 GraphColSmp Sample1.txt --->Sample1.txt is uploaded and it is of 10 nodes
