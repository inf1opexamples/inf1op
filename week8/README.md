# On collections

A tiny excercise

Each student has a number of subjects, each subject is scored based on a number of assignments. Assume all the assignments for a subject are worth the same percentage. 
An example:
student 1 
- Subject 1
  - assignment1 65
  - assignment2 80
- Subject 2
  - assignment1 75
- Subject 3
  - assignment1 75
  - assignment2 60
  - assignment3 85
  
  
The goal is to model this with Java, and be able to do the following:
  

- get all of a student grades by subject (example print: Subject1: {assignment1: 65, assignment2: 80}, Subject2: {assignment1: 75}, Subject3: {assignment1: 75, assignment2: 60, assignment3: 85})

- get average scores for each subject (example print: S1:73, S2: 75, S3: 73)

- get best individual score (and the subject and assignment it belongs to) (example print: S3: {assignment3: 85})

- get top 4 scores in general (without repetition) (example print: [85, 80, 75, 65])
