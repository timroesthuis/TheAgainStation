void setup() {
  // put your setup code here, to run once:
  ADMUX |= 0b01100000;
  ADCSRA = 0b10000000;
  ADCSRB = 0b00000000;
  DIDR0 = 0b00000000;

  CLKPR = 0b10000000;
  
  cli();
  TCCR1A = 0;
  TCCR1B = 0b00000101;
//  TCNT1L = 250;
//  TCNT1H = 250;
  TIMSK1 |= (1 << TOIE1);
//  TCCR1B |= (1 << CS11) | (1 << CS10);

  Serial.begin(9600);
  sei();
}

void loop() {
  // put your main code here, to run repeatedly:
  
}

ISR(TIMER1_OVF_vect){
  
  ADCSRA |= (1 << ADSC);
  while(ADCSRA & (1 << ADSC)){}
  int test1 = ADCL >> 6;
  int test2 = ADCH << 2;
  int test = test1 + test2;
  Serial.println(test);
}
