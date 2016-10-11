male(Y) :- Y=ivan; Y=petr; Y=andrew; Y=vasya.
female(X) :- X=ann; X=ylya; X=maria; X=tatyana.

u1(X,Y) :- (not(X=ann), not(Y=ivan)) -> (X=ylya, Y=ivan).
u2(X,Y) :- (not(X=ylya), not(Y=ivan)) -> (X=ann , Y=petr) .
u3(X,Y) :- (not(X=maria), not(Y=vasya)) -> (X=ylya,Y=andrew) .
u4(X,Y) :- (X=ylya, Y=petr) -> (X=tatyana, Y=ivan) .
u5(X,Y) :- (not(X=maria), not(Y=petr)) -> (not(X=tatyana), not(Y=ivan)) .
u6(X,Y) :- (X=maria, Y=ivan) -> (X=ylya, Y=andrew) .
family(X,Y) :- female(X),male(Y),u1(X,Y),u2(X,Y),u3(X,Y),u4(X,Y),u5(X,Y),u6(X,Y) .
