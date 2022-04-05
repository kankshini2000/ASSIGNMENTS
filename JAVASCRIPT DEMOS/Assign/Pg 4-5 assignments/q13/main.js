var arr = [12,34,56,1];

function checkValue(value, arr) {
    var status = 'Not exist';

    for (var i = 0; i < arr.length; i++) {
        var name = arr[i];
        if (name == value) {
            status = 'Exist';
            break;
        }
    }

    return status;
}
document.write(checkValue(12,arr));
