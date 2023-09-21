# apache-hadoop-lab3

This repository contains a series of practical labs related to Apache Hadoop MapReduce, designed for undergraduates interested in big data and distributed computing. These labs cover various aspects of Hadoop MapReduce, from writing Java programs to using Hadoop Streaming and writing unit tests.

## Lab 1: Writing a MapReduce Java Program

**Objective**: In this lab, you will learn how to write a MapReduce job using Java. The task is to calculate the average length of words that start with each character in a given text input.

**Key Components**:
- Eclipse project: `averagewordlength`
- Java files: `AverageReducer.java` (Reducer), `LetterMapper.java` (Mapper), `AvgWordLength.java` (driver)
- Test data (HDFS): `shakespeare`

## Lab 2: More Practice With MapReduce Java Programs

**Objective**: In this lab, you will analyze a log file from a web server to count the number of hits made from each unique IP address using MapReduce.

**Key Components**:
- Eclipse project: `log_file_analysis`
- Java files: `SumReducer.java` (Reducer), `LogFileMapper.java` (Mapper), `ProcessLogs.java` (driver)
- Test data (HDFS): `weblog` (full version), `testlog` (test sample set)

## Lab 3: Writing a MapReduce Streaming Program

**Objective**: In this lab, you will repeat the word length calculation task from Lab 1 but using Hadoop Streaming with a scripting language of your choice (e.g., Perl, Python, PHP, Ruby).

**Key Components**: None

## Lab 4: Writing Unit Tests With the MRUnit Framework

**Objective**: This lab focuses on writing unit tests for MapReduce code using the MRUnit framework. You will create tests for both the Mapper and Reducer components.

**Key Components**:
- Eclipse project: `mrunit`
- Java files: `SumReducer.java` (Reducer from WordCount), `WordMapper.java` (Mapper from WordCount), `TestWordCount.java` (Test Driver)

## How to Use This Repository

- Each lab folder contains detailed instructions on the task and the necessary components.
- Follow the provided steps and code samples to complete the labs.
- Use Eclipse for Java-based labs or scripting languages for Hadoop Streaming labs.
- Run unit tests using the MRUnit framework to ensure your MapReduce code functions correctly.
