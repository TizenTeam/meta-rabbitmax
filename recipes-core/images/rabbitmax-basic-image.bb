include recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL_append = " connman connman-client hostapd \
                        nodejs nodejs-npm \
                        git \
                        autoconf automake binutils binutils-symlinks \
                        cpp cpp-symlinks gcc gcc-symlinks g++ g++-symlinks \
                        gettext make libstdc++ libstdc++-dev file coreutils \
                        dnsmasq \
                        i2c-tools \
                        rabbitmax-config \
                        "