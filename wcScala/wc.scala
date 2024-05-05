val f = sc.textFile("/home/siddharth/TA18/test.txt")

val count = f.flatMap(line=>line.split(" ")).map(word=>(word,1)).reduceByKey(_+_);

count.toDebugString;

count.cache()
count.saveAsTextFile("o2")
