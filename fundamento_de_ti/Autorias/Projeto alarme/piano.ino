
void setup() {
  // put your setup code here, to run once:
pinMode(3, OUTPUT);
pinMode(4, INPUT);
pinMode(6, INPUT);
pinMode(9, INPUT);
pinMode(10, INPUT);
pinMode(11, INPUT);
Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  Serial.println(digitalRead(4));
if(digitalRead(4) == LOW){
  tone(3, 262);
}else if(digitalRead(6) == LOW){
  tone(3, 294);
}
else if(digitalRead(9) == LOW){
  tone(3, 330);
}
else if(digitalRead(10) == LOW){
  tone(3, 349);
}
else if(digitalRead(11) == LOW){
  tone(3, 392);
}
else{
  noTone(3);
}
}
