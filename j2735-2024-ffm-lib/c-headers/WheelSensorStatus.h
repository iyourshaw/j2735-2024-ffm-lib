/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeVehicleData"
 * 	found in "asn/J2735-ProbeVehicleData-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_WheelSensorStatus_H_
#define	_WheelSensorStatus_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum WheelSensorStatus {
	WheelSensorStatus_off	= 0,
	WheelSensorStatus_on	= 1,
	WheelSensorStatus_notDefined	= 2,
	WheelSensorStatus_notSupported	= 3
} e_WheelSensorStatus;

/* WheelSensorStatus */
typedef long	 WheelSensorStatus_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_WheelSensorStatus_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_WheelSensorStatus;
extern const asn_INTEGER_specifics_t asn_SPC_WheelSensorStatus_specs_1;
asn_struct_free_f WheelSensorStatus_free;
asn_struct_print_f WheelSensorStatus_print;
asn_constr_check_f WheelSensorStatus_constraint;
ber_type_decoder_f WheelSensorStatus_decode_ber;
der_type_encoder_f WheelSensorStatus_encode_der;
xer_type_decoder_f WheelSensorStatus_decode_xer;
xer_type_encoder_f WheelSensorStatus_encode_xer;
jer_type_encoder_f WheelSensorStatus_encode_jer;
oer_type_decoder_f WheelSensorStatus_decode_oer;
oer_type_encoder_f WheelSensorStatus_encode_oer;
per_type_decoder_f WheelSensorStatus_decode_uper;
per_type_encoder_f WheelSensorStatus_encode_uper;
per_type_decoder_f WheelSensorStatus_decode_aper;
per_type_encoder_f WheelSensorStatus_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _WheelSensorStatus_H_ */
#include "asn_internal.h"
