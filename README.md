# cljs-text-editor

## Usage

To fetch the dependency via Leiningen use `[net.eighttrigrams/cljs-text-editor "0.0.8"]`.

## Development

### Run

#### Command line

```bash
$ npx shadow-cljs watch app
```

#### VSCode

- REPL
    - ShadowCljs
        - :app
            - :app

Make sure shadow is connected on its websocket
in order for the REPL to work.

### Run tests

```bash
$ clj -X:test :dirs '["test"]'
```

### Deploy

```bash
$ clojure -X:jar :jar CljsTextEditor.jar
$ env CLOJARS_USERNAME=username CLOJARS_PASSWORD=token clj -X:deploy
```

## Info

Set up with shadow-cljs [`shadow-cljs/quickstart-browser`](https://github.com/shadow-cljs/quickstart-browser)
