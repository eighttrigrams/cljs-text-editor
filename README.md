# cljs-text-editor

## Run tests

```bash
$ clj -X:test :dirs '["test"]'
```

## Deploy

```bash
$ clojure -X:jar :jar CljsTextEditor.jar
$ env CLOJARS_USERNAME=username CLOJARS_PASSWORD=token clj -X:deploy
```