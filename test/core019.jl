int main() {
  int i = 78;
  {
    int i = 1;
    printInt(i);
  }
  printInt(i);
  while (i > 76) {
    i--;
    printInt(i);
   int i = i + 7;
   printInt(i);
  }
  printInt(i);
  if (i > 4) {
    int i = 4;
    printInt(i);
  } else {
    printString("foo");
  } 
  printInt(i);
  return 0 ;

}