a(X) :-	not(X=vitya), X=borya .
b(X) :- X=vitya, not(X=alesha).
c(X) :- (not(X=borya), X=alesha); (not(X=borya), X=vitya) ; (not(X=borya), X=botya) .

putaspot(X) :- (a(X), b(X), not(c(X)) ).
putaspot(X) :- (a(X), c(X), not(b(X)) ).
putaspot(X) :- (b(X), c(X), not(a(X)) ).
