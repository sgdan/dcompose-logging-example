import java.nio.file.Files
import java.nio.file.Paths

// get a bunch of non-empty lines 
path = Paths.get('./source.txt')
stream = Files.lines(path)
lines = stream.filter{ it.length() > 30 }.limit(200).toList()

levels = ['DEBUG', 'WARN', 'INFO', 'ERROR', 'FATAL', 'TRACE']
rnd = new Random()

// keep logging stuff to stdout!
while (true) {
    level = levels.get(rnd.nextInt(levels.size()))
    line = lines.get(rnd.nextInt(lines.size()))
    println "[$level] $line"
    Thread.sleep 200L
}
