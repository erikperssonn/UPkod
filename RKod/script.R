source("https://fileadmin.cs.lth.se/cs/Education/EDAA35/R_resources.R")
library(ggplot2)

system("javac C:/Users/johan/UP/Project/UPkod/demo/src/main/java/com/example/*.java")

plotResult <- function(file, start = 1) {

  system("java -cp C:/Users/johan/UP/Project/UPkod/demo/src/main/java/com/example com.example.Main ord bubble 400")
         
  
  dataSet <- read.csv(file, header = FALSE)
  xs <- c(1:nrow(dataSet))
  
  
  df <- data.frame(dataSet)
  colnames(df) <- 'exekveringstid'
  
  df$mätningar <- xs
  print(df)
  
  ggplot(df, aes(mätningar, exekveringstid)) +
    geom_point(size = 3, colour = "magenta") +
    geom_line(colour = "blue")

}
plotResult("C:/Users/johan/UP/Project/UPkod/utfil.txt")

