class LRUCache:
    def __init__(self, capacity):
        self.capacity = capacity
        self.cache = []
        self.lru = {}

    def refer(self, key):
        # not present in cache
        if key not in self.lru:
            if len(self.cache) >= self.capacity:
                lru_key = self.cache.pop()
                del self.lru[lru_key]

            self.cache.insert(0, key)
            self.lru[key] = key
            # present in cache
        else:
            # update reference
            self.cache.remove(key)
            self.cache.insert(0, key)

    def display(self):
        for i in self.cache:
            print(i, end=' ')
        print('')
