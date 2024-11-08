/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_PortlandCementType_H_
#define	_PortlandCementType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum PortlandCementType {
	PortlandCementType_newSharp	= 0,
	PortlandCementType_traveled	= 1,
	PortlandCementType_trafficPolished	= 2
	/*
	 * Enumeration is extensible
	 */
} e_PortlandCementType;

/* PortlandCementType */
typedef long	 PortlandCementType_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_PortlandCementType_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_PortlandCementType;
extern const asn_INTEGER_specifics_t asn_SPC_PortlandCementType_specs_1;
asn_struct_free_f PortlandCementType_free;
asn_struct_print_f PortlandCementType_print;
asn_constr_check_f PortlandCementType_constraint;
ber_type_decoder_f PortlandCementType_decode_ber;
der_type_encoder_f PortlandCementType_encode_der;
xer_type_decoder_f PortlandCementType_decode_xer;
xer_type_encoder_f PortlandCementType_encode_xer;
jer_type_encoder_f PortlandCementType_encode_jer;
oer_type_decoder_f PortlandCementType_decode_oer;
oer_type_encoder_f PortlandCementType_encode_oer;
per_type_decoder_f PortlandCementType_decode_uper;
per_type_encoder_f PortlandCementType_encode_uper;
per_type_decoder_f PortlandCementType_decode_aper;
per_type_encoder_f PortlandCementType_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _PortlandCementType_H_ */
#include "asn_internal.h"
