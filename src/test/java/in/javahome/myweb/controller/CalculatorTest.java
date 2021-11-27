package in.javahome.myweb.controller;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
	int minval(int *A, int n) {
  int currmin;

  for (int i=0; i<n; i++)
    if (A[i] < currmin)
      currmin = A[i];
  return currmin;
}
	
}
