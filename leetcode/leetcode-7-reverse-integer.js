var reverse = function(x) {
    const pos = Math.abs(x);
    const rev = parseInt((pos + '').split('').reverse().join(''), 10);

    const border = Math.pow(2, 31);
    const isOverflow = n => n < -border || n > border - 1;
    if (isOverflow(rev)) {
        return 0;
    }

    return pos === x ? rev : -rev;
};

module.exports = reverse;