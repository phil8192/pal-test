palindromes
===========

test repo. (nothing to see here.)

requires
--------
java >= 7

building
--------
```bash
make
```

running
-------
```bash
./run.sh <string>
```

examples
========

```
./run.sh a
Text: a, Index: 0, Length: 1
```

```
./run.sh aa
Text: aa, Index: 0, Length: 2
Text: a, Index: 0, Length: 1
```
```
./run.sh aaa
Text: aaa, Index: 0, Length: 3
Text: aa, Index: 0, Length: 2
Text: a, Index: 0, Length: 1
```
```
./run.sh aaaa
Text: aaaa, Index: 0, Length: 4
Text: aaa, Index: 0, Length: 3
Text: aa, Index: 0, Length: 2
```
```
./run.sh aba
Text: aba, Index: 0, Length: 3
Text: a, Index: 0, Length: 1
Text: b, Index: 1, Length: 1
```
```
./run.sh abba
Text: abba, Index: 0, Length: 4
Text: bb, Index: 1, Length: 2
Text: a, Index: 0, Length: 1
```
```
./run.sh abbbba
Text: abbbba, Index: 0, Length: 6
Text: bbbb, Index: 1, Length: 4
Text: bbb, Index: 1, Length: 3
```
```
./run.sh abbabba
Text: abbabba, Index: 0, Length: 7
Text: bbabb, Index: 1, Length: 5
Text: abba, Index: 0, Length: 4
```
```
./run.sh αννα
Text: αννα, Index: 0, Length: 4
Text: νν, Index: 1, Length: 2
Text: α, Index: 0, Length: 1
```

