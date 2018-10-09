const FIZZ = 'Fizz';
const BUZZ = 'Buzz';
const WHIZZ = 'Whizz';

const isMultipleOfBase = base => n => n % base === 0;

function fizz(a, b, c) {
    const isFizz = isMultipleOfBase(a)
    const isBuzz = isMultipleOfBase(b)
    const isWhizz = isMultipleOfBase(c)

    return n => {
        if (`${n}`.includes(a)) {
            return FIZZ;
        }

        if (isFizz(n) && isBuzz(n) && isWhizz(n)) {
            return FIZZ + BUZZ + WHIZZ;
        }

        if (isFizz(n) && isBuzz(n)) {
            return FIZZ + BUZZ;
        }

        if (isBuzz(n) && isWhizz(n)) {
            return BUZZ + WHIZZ;
        }

        if (isFizz(n) && isWhizz(n)) {
            return FIZZ + WHIZZ;
        }

        if (isFizz(n)) {
            return FIZZ;
        }

        if (isBuzz(n)) {
            return BUZZ;
        }

        if (isWhizz(n)) {
            return WHIZZ;
        }

        return n;
    }
}

module.exports = fizz;