package stubs;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class LetterMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    for(String keyValue: value.toString().split("\\W")){
    	if(keyValue.length() > 0)
    		context.write(new Text(String.valueOf(keyValue.charAt(0))), new IntWritable(keyValue.length()));
    }
    
  }//end map
}//end class
