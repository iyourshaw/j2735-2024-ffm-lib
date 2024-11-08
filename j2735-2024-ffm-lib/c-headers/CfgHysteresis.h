/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CfgHysteresis_H_
#define	_CfgHysteresis_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* CfgHysteresis */
typedef struct CfgHysteresis {
	long	 hysSamples;
	long	 hysRate;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CfgHysteresis_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CfgHysteresis;
extern asn_SEQUENCE_specifics_t asn_SPC_CfgHysteresis_specs_1;
extern asn_TYPE_member_t asn_MBR_CfgHysteresis_1[2];

#ifdef __cplusplus
}
#endif

#endif	/* _CfgHysteresis_H_ */
#include "asn_internal.h"
