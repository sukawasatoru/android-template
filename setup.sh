#!/bin/bash -eux

TITLE=
APP=
LIB=
UNKNOWN=

function update_package() {
local old_name="${1}"
local new_name="${2}"

grep -R --exclude ${0} --exclude-dir .git --exclude-dir .gradle "${old_name}" . | cut -d: -f1 | sort --unique | xargs -IFILE sed -i .bak -e "s/${old_name}/${new_name}/g" FILE
local DIR
for DIR in $(find . -type d -name "${old_name}"); do
    mv "${DIR}" $(sed -e "s/${old_name}/${new_name}/g" <<< "${DIR}")
done
}

while [[ ${#} -gt 1 ]]; do
    key="${1}"
    case "${key}" in
        --title)
            TITLE="${2}"
            shift
            ;;
        --app)
            APP="${2}"
            shift
            ;;
        --lib)
            LIB="${2}"
            shift
            ;;
        *)
            UNKNOWN=true
            shift
            ;;
    esac
    shift
done

if [[ ${UNKNOWN} || (-z ${TITLE} && -z ${APP} && -z ${LIB}) ]]; then
    echo "title: ${TITLE}, app: ${APP}, lib: ${LIB}"
    exit 1
fi

./gradlew --no-daemon clean
if [[ ${?} -ne 0 ]]; then
    exit $?
fi

if [[ ${TITLE} ]]; then 
    update_package 'Android Template' "${TITLE}"
fi

if [[ ${APP} ]]; then
    update_package myapplication "${APP}"
fi

if [[ ${LIB} ]]; then
    update_package mylibrary "${LIB}"
fi

find . -name '*.bak' -exec rm {} \;
