DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5"

SRC_URI[arm-fb.md5sum] = "ef691833ceb99bec06d009c7f0e4241a"
SRC_URI[arm-fb.sha256sum] = "ae96371195e892310c659595d42d9febec61c220ba5c66b510598cba45c0d6af"

SRC_URI[arm-wayland.md5sum] = "f6e60a5854b8c1a29e7d377ca6faf361"
SRC_URI[arm-wayland.sha256sum] = "fe3fdb6d5d6cc3e74c58e43026744f2751ad81fc5081675949ff2bc9ce3a012e"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "cb35089ed24fcb16ee1332149697f261"
SRC_URI[aarch64-wayland.sha256sum] = "7f047e91f917d2a9d6e5f144e4c1203f61b485af54e517b78ca74338457007e0"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"