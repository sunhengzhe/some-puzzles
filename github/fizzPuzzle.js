const isMultipleOfBase = base => n => n % base === 0;

function fizzPuzzle(first, second, third) {
    const includesFirst = n => `${n}`.includes(first);

    const map = {
        [first]: 'Fizz',
        [second]: 'Buzz',
        [third]: 'Whizz'
    }

    const countOffNumber = n => {
        let rst = '';
        for (const key in map) {
            if (isMultipleOfBase(key)(n)) {
                rst += map[key];
            }
        }

        if (includesFirst(n)) {
            rst = map[first];
        }

        return {
            isMet: rst !== '',
            rst,
        };
    }

    return n => {
        const { isMet, rst } = countOffNumber(n);

        if (!isMet) {
            return n;
        }

        return rst;
    }
}

module.exports = fizzPuzzle;