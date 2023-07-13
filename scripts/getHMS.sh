#!/bin/bash

echo "Script is start"

awk -F',' '{print $0}' /home/sriharipriya/import_file/scripts/FDB_Daily_price_updates.csv

#source /mnt/c/Users/AMBATS/Desktop/Batchjob/SourceFile/FDB_Daily_price_updates.csv

echo "Script is running"
