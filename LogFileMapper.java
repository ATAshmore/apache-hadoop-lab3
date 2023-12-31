package stubs;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Example input line:
 * 96.7.4.14 - - [24/Apr/2011:04:20:11 -0400] "GET /cat.jpg HTTP/1.1" 200 12433
 *
 */
public class LogFileMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    /*
     * TODO implement
     */

	  	//split input by spaces. 
	    String[] fields = value.toString().split(" ");  
	    if (fields.length > 0) {  
	  
	    	
	      //use first field, ip address, as the key and assign 1 as value.
	      //rest of fields are useless
	      String ip = fields[0];  
	      context.write(new Text(ip), new IntWritable(1));  
	    }  

  }
}