var createCounter = function(init) {
    let a = init
    return {
        increment: function () {
            return ++init;
        },
        decrement: function () {
            return --init;
        },
        reset: function () {
            init = a;
            return init;
        }
    };
};
