all: basic

basic: basic.p4
	p4c-bm2-ss -o p4c-out/bmv2/basic.json \
		--p4runtime-file p4c-out/bmv2/basic.p4info \
		--p4runtime-format text basic.p4

clean:
	rm -rf p4c-out/bmv2/*.json
	rm -rf p4c-out/bmv2/*.p4info
