Results for the Software Interview Problems
===

# Problem - 1

- C++ Docker Image

```
docker build -t cpp-lrucache-image .
docker images
```

-  Python Docker Image

```
docker build -t python-lrucache-image .
docker images
```

- Java Docker Image

```
docker build -t java-lrucache-image .
docker images
```

# Problem - 2

- C++ Build

```
g++ -o test test.cpp
./test
```

- Java Build

```
mvn clean package
```

- Python Run

```
python lru.py
```

# Problem - 3

- C++ Docker Run Output

```
docker run cpp-lrucache-image

Output: 5 4 1 3
```

- Java Docker Run Output

```
docker run java-lrucache-image

Output: 5 4 1 3
```

- Python Docker Run Output

```
docker run python-lrucache-image

Output: 5 4 1 3
```
