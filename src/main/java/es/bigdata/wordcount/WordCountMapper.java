package es.bigdata.wordcount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Emite (palabra, 1) por cada palabra del texto de entrada.
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    private static final IntWritable ONE = new IntWritable(1);
    private final Text outputWord = new Text();

    @Override
    public void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException {
        StringTokenizer tokenizer = new StringTokenizer(value.toString());

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken()
                    .toLowerCase(java.util.Locale.ROOT)
                    .replaceAll("^[^\\p{L}\\p{N}]+|[^\\p{L}\\p{N}]+$", "");

            if (!word.isEmpty()) {
                outputWord.set(word);
                context.write(outputWord, ONE);
            }
        }
    }
}
